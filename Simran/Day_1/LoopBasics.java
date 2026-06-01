public class LoopBasics {
    public static void main(String[] args) {
        
        System.out.println("--- Method 1: Using a While Loop ---");
        
        // Step 1: Initialization of loop variable
        int i = 1; 
        
        // Step 2: Evaluation / Condition Check
        while (i <= 9) { 
            // Loop Body Execution
            System.out.println(i); 
            
            // Step 3: Incrementing the loop variable to avoid infinite execution
            i = i + 1; // This can also be written as i++
        }
        
        // This statement prints only after the loop condition becomes false
        System.out.println("While loop execution is Done.\n");


        System.out.println("--- Method 2: Using a Compact For Loop ---");
        
        /* A 'for loop' combines initialization, evaluation, and increment 
         into a single compact line for better readability.
        */
        // order of execution: initialization -> condition check -> body -> increment -> condition check...
        for (int j = 1; j <= 9; j++) {
            System.out.println(j);
        }
        
        System.out.println("For loop execution is Done.");
    }
}