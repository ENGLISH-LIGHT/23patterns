package command;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class productManager {
//    The max numbers for everyone coder every day
    private static final int TASK_NUMBER_IN_DAY = 4;
//    The command or task list
    private List<task> taskList ;
//    The coders list
    private List<programmer> monkeyList;

    public productManager(programmer... monkeys){
        if (monkeys == null || monkeys.length == 0){
            throw new RuntimeException("no coders to use!!!");
        }
        taskList = new ArrayList<task>();
        monkeyList = Arrays.asList(monkeys);
    }
//    add a new task to taskList
    public void receive(task t){
        taskList.add(t);
    }
//    assign task
    public void assign(){
        task[] copy = new task[taskList.size() > TASK_NUMBER_IN_DAY ? taskList.size() - TASK_NUMBER_IN_DAY : 0];
        for (int i = 0; i < TASK_NUMBER_IN_DAY && i < taskList.size(); i++) {
            taskList.get(i).handle();
        }
        //数组间的复制，参数1是源数组，参数2是起始位置，参数3是目标数组，参数4是目标数组放置的起始位置，参数5是复制数据长度。这个方法也可以用来复制自身，原理是先生成一个临时数据作为源数组。
        System.arraycopy(taskList.toArray(), TASK_NUMBER_IN_DAY > taskList.size() ? taskList.size() : TASK_NUMBER_IN_DAY, copy, 0, copy.length); taskList = Arrays.asList(copy);
    }
//    choose coder - circle choose
    private static int index = 0;

    public programmer choosecoder(){
        return monkeyList.get(index == monkeyList.size() ? 0 : index++);
    }

    public void printTaskList(){
        if (taskList == null || taskList.size() == 0){
            System.out.println("---------------no tasks-----------------");
            return;
        }
            System.out.println("--------------left tasks----------------");
        for (task t : taskList){
            System.out.println(t);
        }
            System.out.println("----------------------------------------");
    }
}
