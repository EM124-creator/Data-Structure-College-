package Admin;
public class Queue{

      Object [] array;
      int index=0;
      int pointer = 0;

      Queue(){
            array = new Object[5];
      }

      Queue(int index){
            array = new Object[index];
      }

      void offer(Object value){
            array[index++] = value;
      }

      Object poll(){
            Object temp = array[pointer];
            if(!isEmpty()){
                  pointer ++;
                  Object tempArray [] = new Object[array.length-pointer];
                  for(int i=0;i<tempArray.length;i++){
                        if(pointer < array.length){
                        tempArray[i] = array[pointer];
                        pointer++;
                        }
                  }
                  for(int i =0; i<array.length; i++){
                        array[i] = null;
                  }
                  index = -1;
                  for(int g = 0; g<tempArray.length; g++){
                  array[++index] = tempArray[g];
                  }
                  pointer = 0;
                  return temp;
            }
            return "Queue is Empty";
      }


      boolean isEmpty(){
            if(index ==-1 || pointer > index){
                  return true;
            }else{
                  return false;
            }
      }

      void print(){
            System.out.print("[");
            for(int i =0; i<array.length; i++){
                  
                  if(i==array.length-1){
                  System.out.print(array[i]);
                  }
                  else{System.out.print(array[i] + ",");}
            }
            System.out.print("]");
            System.out.println();
      }
      
      Object peek() {
    	  if(!isEmpty()) {
    	  return array[0];}
          return "Queue is Empty";
    	  
      }


      public static void main(String[] args) {
            Queue queue = new Queue();
            queue.offer(1);
            queue.offer(2);
            queue.offer(3);
            queue.offer(4);
            queue.offer(5);

            System.out.println(queue.poll());
            System.out.println(queue.poll());


            queue.offer(1);
            queue.offer(1);
            
            queue.poll();
            queue.poll();
            

            System.out.println("Index = " + queue.index);
            queue.print();
            System.out.println("Pointer = " + queue.pointer);
            System.out.println(queue.peek());
            
      }



      }

