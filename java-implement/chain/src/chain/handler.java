package chain;

public abstract class handler {
        protected handler successor = null;
//      设置当前不能处理时，交给下一handler处理
        public  void setSuccessor(handler successor){
            this.successor = successor;
        }
        public handler getSuccessor(){
            return this.successor;
        }
        //how much is what someone request
        public abstract String handleRequest(String name,double fee);
}
