class Solution {
  	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		// Input array size
        System.out.print("Enter number of digits: ");
        int n = sc.nextInt();
        int[] digits = new int[n];
        
        System.out.println("Enter The Details one by One:");
        for(int i=0; i<n;i++) {
        	digits[i] = sc.nextInt();
        	
        }
        
        int[] result = plusOne(digits);
        
        System.out.println("Result after adding one; ");
        for(int num:result) {
        	System.out.println(num);
        }
        
        sc.close();
	}
	
	public static int[] plusOne(int[] digits) {
		int n =digits.length;
		
		
		for(int i=n-1; i>=0; i--) {
			if(digits[i]<9) {
				digits[i]++;
				return digits;
			}
			digits[i]=0;
		}
		
		int[] newNumber = new int[n+1];
		newNumber[0]=1;
		return newNumber;
	}
}
