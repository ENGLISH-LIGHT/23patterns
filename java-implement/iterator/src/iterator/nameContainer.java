package iterator;

public class nameContainer implements container{
    public String names[] = {"Robert" , "John" ,"Julie" , "Lora"};
    @Override
    public iterator getIterator() {
        return new nameIterator();
    }
    private class nameIterator implements iterator{
        public  int index = 0;
        @Override
        public boolean hasNext() {
            if(index < names.length){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if(this.hasNext()){
                return names[index++];
            }
            return null;
        }
    }
}
