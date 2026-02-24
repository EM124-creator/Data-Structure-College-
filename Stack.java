
public class Stack{


      Object array [] ;
      int pointer = -1;

      Stack(){
            array = new Object [10];
      }

      Stack(int size){
            array = new Object[size];
      }

      void push(Object value){
            if(pointer!=array.length-1){
            pointer++;
            array[pointer] = value;}
            else{System.out.println("Stack is full");}
      }

      Object pop (){
            if(!isEmpty()){
            Object temp = array[pointer];
            pointer--;
            return temp;}

            return "Stack is Empty";
      }
      
      Object peek(){
            if(!isEmpty()){
            return array[pointer];}
            return "Stack is Empty";
      }

      boolean isEmpty(){
            if(pointer==-1){
                  return true;
            }
            return false;
      }

      Object print(int index){
            if(!isEmpty()){
            return array[index];}
            return "Stack is Empty";
      }

      void print(){
            if(!isEmpty()){
                  System.out.print("[");
      for(int i =0; i<=pointer; i++){
            if(i!= 0){
                        System.out.print(",");
            }
            System.out.print(array[i]);
      }
                  System.out.print("]");

}
else{System.out.println("Stack is Empty");
}
      }





















}
