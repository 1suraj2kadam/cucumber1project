
public class pyramid {

	public static void main(String[] args) {
	 String a="shakuntalla";
	 
	 char[] str=a.toCharArray();
	 
	 for(int i=0;i<str.length;i++) {
		 for(int j=i+1;j<str.length;j++) {
			 if(str[i]==str[j] && i!=j) {
				System.out.print(str[j]);
				System.out.println(i);
				break;
			 }
		 }
	 }
}
}
