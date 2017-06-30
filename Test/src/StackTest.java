
public class StackTest {

	//平衡符号
	public static boolean balanceRace( String str) {
		MyStack1<String> myStack1 = new MyStack1<>();
		MyStack1<String> myStack2 = new MyStack1<>();
		MyStack1<String> myStack3 = new MyStack1<>();
		MyStack1<String> myStack4 = new MyStack1<>();
		for (int i = 0; i < str.length(); i++) {
			String s = str.substring(i, i + 1);
			if( s.equals("("))
				myStack1.push(s);
			else if(s.equals("{"))
				myStack2.push(s);
			else if(s.equals("<"))
				myStack3.push(s);
			else if(s.equals("["))
				myStack4.push(s);
			
			if( s.equals(")") && !myStack1.isEmpty()) {
				if (myStack1.peek() .equals("(")) {
					return false;
				}
				myStack1.pop();
			}
			else if( s.equals("}")  && !myStack2.isEmpty()) {
				if (myStack2.peek() .equals("(")) {
					return false;
				}
				myStack2.pop();
			}
			else if( s.equals(">")  && !myStack3.isEmpty()) {
				if (myStack3.peek() .equals("(")) {
					return false;
				}
				myStack3.pop();
			}
			else if( s.equals("]")  && !myStack4.isEmpty()) {
				if (myStack4.peek() .equals("(")) {
					return false;
				}
				myStack4.pop();
			}
			else if(( myStack1.isEmpty() || myStack2.isEmpty() || myStack3.isEmpty() || myStack4.isEmpty() ) && ( s.equals(")") || s.equals("}") || s.equals(">") || s.equals("]")))
				return false;
		}
		
		if( !( myStack1.isEmpty() || myStack2.isEmpty() || myStack3.isEmpty() || myStack4.isEmpty() ))
			return false;
		
		return true;
	}
	
	//后缀表达式
	public static int postfix(String str) {
		MyStack1<Integer> myStack1 = new MyStack1<>();
		String[] strings = str.split(" ");
		for (int i = 0; i < strings.length; i++) {
			String s = strings[i];
			if (s.equals("+")) {
				int a = myStack1.pop();
				int b = myStack1.pop();
				myStack1.push( a + b );
			}else if (s.equals("-")) {
				int a = myStack1.pop();
				int b = myStack1.pop();
				myStack1.push( a - b );
			}else if (s.equals("*")) {
				int a = myStack1.pop();
				int b = myStack1.pop();
				myStack1.push( a * b );
			}else if (s.equals("/")) {
				int a = myStack1.pop();
				int b = myStack1.pop();
				myStack1.push( a / b );
			}else{
				myStack1.push(Integer.parseInt(s));
			}
		}
		return myStack1.pop();
	}
	
	public static void main(String[] args) {
//		System.out.println(balanceRace("{}"));
		System.out.println(postfix("6 5 2 3 + 8 * + 3 + *"));
	}
}
