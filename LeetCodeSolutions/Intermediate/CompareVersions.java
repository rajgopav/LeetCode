
public class CompareVersions {
	
	public int compareVerions(String version1, String version2) {
		String arr1[] = version1.split("\\.");
		String arr2[] = version2.split("\\.");
		
		int i=0;
		int j=0;
		while(i < arr1.length && j < arr2.length){
			int num1 = Integer.parseInt(arr1[i]);
			int num2 = Integer.parseInt(arr2[j]);
			
			if(num1 > num2) {
				return 1;
			} else if (num1 < num2) {
				return -1;
			} else {
				i++;
				j++;
			}
		}
		
		while(i < arr1.length){
			int num1 = Integer.parseInt(arr1[i]);
			if(num1 != 0){
				return 1;
			} else {
				i++;
			}
		}
		
		while(j < arr2.length){
			int num1 = Integer.parseInt(arr2[j]);
			if(num1 != 0){
				return -1;
			} else {
				j++;
			}
		}
		
		return 0;
	}
	
	public static void main(String[] args) {
		CompareVersions cv = new CompareVersions();
		String version1 = "1.0.0.0";
		String version2 = "1.";
		int result = cv.compareVerions(version1, version2);
		System.out.print(result);
	}
}
