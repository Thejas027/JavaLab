package Program12;

class stackOverFlow extends Exception {
  public stackOverFlow(String message) {
    super(message);
  }
}

class stackUnderflow extends Exception {
  public stackUnderflow(String message) {
    super(message);
  }
}

class Stack {
  static final int MAX_SIZE = 5;
  int top;
  int[] stArr;

  public Stack() {
    top = -1;
    stArr = new int[MAX_SIZE];
  }

  public void push(int value) throws stackOverFlow {
    if (top == MAX_SIZE - 1) {
      throw new stackOverFlow("Stack is full");
    }
    stArr[++top] = value;
  }

  public int pop() throws stackUnderflow {
    if (top == -1) {
      throw new stackUnderflow("STACK IS EMPTY");
    }
    return stArr[top--];
  }
}

public class StacksException {
  public static void main(String[] args) {
    Stack s = new Stack();
    try {
      s.push(1);
      s.push(3);
      s.push(4);
      s.push(5);

      System.out.println();
      System.out.println("Poped ele : " + s.pop());
      System.out.println("Popped ele :" + s.pop());
      System.out.println("Popped ele : " + s.pop());
      System.out.println("Poped ele : " + s.pop());
    } catch (stackUnderflow | stackOverFlow e) {
      System.out.println(e.getMessage());
    }
  }
}
