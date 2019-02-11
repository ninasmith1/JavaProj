import java.util.Scanner;

public class Runner {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose a dinosaur: triceratops, velociraptor, or stegosaurus");
        String category = sc.nextLine();
        if(category.equals("velociraptor")){

            System.out.println("Enter an adjective");
            String v1 = sc.nextLine();

            System.out.println("Enter a proper noun");
            String v2 = sc.nextLine();

            System.out.println("Enter a noun");
            String v3 = sc.nextLine();

            System.out.println("Enter an adjective");
            String v4 = sc.nextLine();

            System.out.println("Enter a plural noun");
            String v5 = sc.nextLine();

            System.out.println("Enter a noun");
            String v6 = sc.nextLine();

            System.out.println("Enter an adjective");
            String v7 = sc.nextLine();

            System.out.println("Enter a noun");
            String v8 = sc.nextLine();

            System.out.println("The Velociraptor was a very " + v1 + " dinosaur.");
            System.out.println("It was not as big as the other dinosaurs.");
            System.out.println("It was about the size of " + v2 + ".") ;
            System.out.println("It was as tall as a child and about as heavy as a " + v3 + ".");
            System.out.println("It walked on 2 " + v4 + " legs.");
            System.out.println("It was a meat eater who ate anything it could catch, like " + v5 + ".");
            System.out.println("Even though it was short, the Velociraptor could catch a lot of food by using its "
                + v6 + " to jump high.");
            System.out.println("The name 'Velociraptor' means " + v7 + " " + v8 + ".");

        }else if(category.equals("stegosaurus")){

            System.out.println("Enter an adjective");
            String s1 = sc.nextLine();

            System.out.println("Enter a plural noun");
            String s2 = sc.nextLine();

            System.out.println("Enter an adjective");
            String s3 = sc.nextLine();

            System.out.println("Enter a noun");
            String s4 = sc.nextLine();

            System.out.println("Enter a noun");
            String s5 = sc.nextLine();

            System.out.println("Enter an adjective");
            String s6 = sc.nextLine();

            System.out.println("Enter a plural noun");
            String s7 = sc.nextLine();

            System.out.println("Enter an adjective");
            String s8 = sc.nextLine();

            System.out.println("The stegosaurus was a " + s1 + " looking dinosaur with a lot of " + s2
                + " on its back.");
            System.out.println("The name 'Stegosaurus' means " + s3 + " " + s4 + ".") ;
            System.out.println("Many people also know about this dinosaur because its brain was so small -" +
                    " it was the size of a " + s5 + "!");
            System.out.println("It was 9 feet tall and ate only plants.");
            System.out.println("It walked around on 4 " + s6 + " legs.");
            System.out.println("It weighed 3,000 pounds, which is smaller than the weight of most " + s7 + ".");
            System.out.println("Do not let that trick you - this dinosaur was huge, but to us it would have been "
                + s8 + "!");

        }else if(category.equals("triceratops")){
            System.out.println("Enter an adjective");
            String t1 = sc.nextLine();

            System.out.println("Enter a plural noun");
            String t2 = sc.nextLine();

            System.out.println("Enter a proper noun");
            String t3 = sc.nextLine();

            System.out.println("Enter an adjective");
            String t4 = sc.nextLine();

            System.out.println("Enter a proper noun");
            String t5 = sc.nextLine();

            System.out.println("Enter an object");
            String t6 = sc.nextLine();

            System.out.println("Enter a plural noun");
            String t7 = sc.nextLine();

            System.out.println("Enter a plural noun");
            String t8 = sc.nextLine();

            System.out.println("The triceratops was a dinosaur that looked " + t1 + " because it had 3 "
                    + t2 + " on the top of its head. ");
            System.out.println("It used these to stay safe from enemies like " + t3
                    + ". It was a " + t4 + " dinosaur, but not the biggest. ") ;
            System.out.println("It was only 10 feet tall. That is not even as tall as " + t5 + ". ");
            System.out.println("It walked on 4 legs that were as short as a " + t6
                    + ". Triceratops was a plant eater. ");
            System.out.println("Its favorite food was " + t7 + ", but it also ate " + t8 + ".");
        }
    }
}

