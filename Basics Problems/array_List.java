import java.util.ArrayList;

public class array_List {
    public static void main(String[] args) {

        // size = n (10 at first)
        // next size increment = n + n/2 +1

        ArrayList<String> studentName = new ArrayList<>();

        studentName.add("Hridayansh");
        studentName.add(0,"Ram"); //adding element at certain position
        System.out.println(studentName);

        ArrayList<String> newStudentList = new ArrayList<>();

        newStudentList.add("newRam");
        newStudentList.add("Shyam");
        System.out.println(newStudentList); 

        studentName.addAll(newStudentList); //adding another list to student name
        System.out.println(studentName);

        studentName.set(2, "2nd elementAdded"); //Adding Elements at certain position (3rd position - 0,1,2,3,4.....)
        System.out.println(studentName);
        
        System.out.println(studentName.get(1)); //accessing certain element

        studentName.remove(1); //Removing elements at certain position
        System.out.println(studentName);

        System.out.println(newStudentList.contains("Shyam")); //true or false

        newStudentList.clear(); //Removing all elements in a list
        System.out.println(newStudentList);

        // Iteration
        for(int i = 0; i<studentName.size() ; i++){
            System.out.println(studentName.get(i));
        }

        // using for Each
        for (String i: studentName){
            System.out.println("forEach: " +i);
        }

    }
}


// Time Complexity = O(n);