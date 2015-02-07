public class recursion{

    public int factorial(int n) {
	if(n < 0) {
	    return -1;
	}
	else if(n <= 1){
	    return 1;
	}
	else{
	    return n * factorial(n - 1);
	}
    }
    
    public int len(String s) {
	if(s.equals("")) {
	    return 0;
	}
	else {
	    return 1 + len(s.substring(0,s.length() - 1));
	}
    }
    
    public int count(String s, char c) {
	if(s.equals("")){
	    return 0;
	} else if(s.charAt(0) == c){
	    return 1 + count(s.substring(1), c);
	} else{
	    return count(s.substring(1), c);
	}
    }
    public int fibonacci(int n) {
	if(n == 0){
	    return 0;
	}
	else if(n == 1){
	    return 1;
	}
	else{
	    return fibonacci(n - 1) + fibonacci (n - 2);
	}
    }

    public int bunnyEars2(int bunnies) {
	if(bunnies == 0){
	    return 0;
	}
	else if(bunnies % 2 == 0){
	    return 3 + bunnyEars2(bunnies - 1);
	}
	else{
	    return 2 + bunnyEars2(bunnies - 1);
	}
    }
    public int strCount(String str, String sub) {
	if(str.length() < sub.length()){
	    return 0;
	}
	else if(str.substring(0,sub.length()).equals(sub)){
	    return 1 + strCount(str.substring(sub.length(),str.length()),sub);
	}
	else{
	    return 0 + strCount(str.substring(1,str.length()),sub);
	}
    }
    public int sumDigits(int n) {
	if(n / 10 == 0){
	    return n;
	}
	else{
	    return n % 10 + sumDigits(n / 10);
	}
    }
    public String allStar(String str) {
	if(str.length() <= 1){
	    return str;
	}
	else{
	    return str.substring(0,1) + "*" + allStar(str.substring(1));
	}
    }


    public static void main(String[] args){
	recursion a = new recursion();
	System.out.println(a.factorial(3));
	System.out.println(a.len("Code"));
	System.out.println(a.count("banana", 'a'));
	System.out.println(a.bunnyEars2(5));
	System.out.println(a.strCount("Rabbit","bb"));
	System.out.println(a.sumDigits(189));
	System.out.println(a.allStar("Stars"));
    }
}
