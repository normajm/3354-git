package adder;

public class Main {

    public static void main(String[] args) {
        try {
            int result = addArguments(args);
            System.out.println(result);
        } catch (Exception e) {
            System.err.println("Please provide two integers to add");
        }
    }

    private static int addArguments(String[] args) {
        return Integer.valueOf(args[0]) + Integer.valueOf(args[1]);
	
	#Modify the method addArguments to add any number of positive 
	#integers instead of just two. 
	
	int sum = 0;
	
	for(int i= 0; i < args.length; i++){
		sum += args[i];



        # subtracts all the positive integers passed as parameters if the
        #first argument is - (a dash.)

		if (args[0] == '-') {
			for(int i = 1; i < args.length; i++){
				sum -= args[i];
			}	
		}
		else {
			for(int i= 0; i < args.length; i++){
                	sum += args[i];
			}
		}

		return sum;
    	}
    }	
