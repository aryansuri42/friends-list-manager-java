import java.util.Scanner;
import java.io.*;

class Login {
    String user, pass;

    Login(String user, String pass) {
        this.user = user;
        this.pass = pass;
        File file1 = new File("C:\\Users\\ARYAN SURI\\Desktop\\Project JAVA\\Properties\\UserList.txt");
        try {
            Scanner scanner = new Scanner(file1);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                boolean val = line.contains(this.user + " " + this.pass);
                if (val) {
                    File file2 = new File(
                            "C:\\Users\\ARYAN SURI\\Desktop\\Project JAVA\\Properties\\" + this.user + "list.txt");
                    try (FileWriter fw = new FileWriter(file2.getAbsoluteFile(), true)) {
                        Scanner askval = new Scanner(System.in);
                        Scanner askval2 = new Scanner(System.in);
                        System.out.println("Select Options");
                        System.out.println("1)Add a Contact");
                        System.out.println("2)Display Contacts");
                        System.out.println("3)Update a Contact");
                        System.out.println("4)Delete a Contact");
                        System.out.println("5)Exit the program");
                        System.out.println("Please select an option");
                        int value = askval.nextInt();
                        if (value == 1) {
                            System.out.print("Enter Name: ");
                            String name = askval.next();
                            System.out.print("Enter Contact Number: ");
                            String phno = askval2.next();
                            System.out.print("Enter Address: ");
                            String addrs = askval.next();
                            System.out.print("Enter DOB (dd/mm/yy): ");
                            String dob = askval2.next();
                            fw.write("Name: " + name + " Contact Number: " + phno + " Address: " + addrs + " DOB: "
                                    + dob + '\n');
                            fw.close();
                            Login obj5 = new Login(this.user, this.pass);

                        } else if (value == 2) {
                            try {
                                Scanner scannersearch = new Scanner(file2);
                                while (scannersearch.hasNextLine()) {
                                    String linesearch = scannersearch.nextLine();
                                    System.out.println(linesearch);
                                }
                                System.out.println("File is completely scanned");
                            } catch (FileNotFoundException e) {
                                e.printStackTrace();
                            }
                            Login obj5 = new Login(this.user, this.pass);

                        } else if (value == 3) {
                            // Instantiating the Scanner class to read the file
                            Scanner sc = new Scanner(file2);
                            // instantiating the StringBuffer class
                            StringBuffer buffer = new StringBuffer();
                            // Reading lines of the file and appending them to StringBuffer
                            while (sc.hasNextLine()) {

                                buffer.append(sc.nextLine() + System.lineSeparator());
                            }
                            String fileContents = buffer.toString();
                            // closing the Scanner object
                            sc.close();
                            System.out.println("Enter the Contact to be updated");

                            System.out.print("Enter Name: ");
                            String name = askval2.nextLine();
                            System.out.print("Enter Contact Number: ");
                            String phno = askval2.nextLine();
                            System.out.print("Enter Address: ");
                            String addrs = askval2.nextLine();
                            System.out.print("Enter DOB (dd/mm/yy): ");
                            String dob = askval2.nextLine();
                            String oldLine = "Name: " + name + " Contact Number: " + phno + " Address: " + addrs
                                    + " DOB: " + dob;

                            System.out.print("Enter Name: ");
                            String nameupt = askval2.nextLine();
                            System.out.print("Enter Contact Number: ");
                            String phnoupt = askval2.nextLine();
                            System.out.print("Enter Address: ");
                            String addrsupt = askval2.nextLine();
                            System.out.print("Enter DOB (dd/mm/yy): ");
                            String dobupt = askval2.nextLine();

                            String newLine = "Name: " + nameupt + " Contact Number: " + phnoupt + " Address: "
                                    + addrsupt
                                    + " DOB: " + dobupt;
                            // Replacing the old line with new line
                            fileContents = fileContents.replaceAll(oldLine, newLine);
                            // instantiating the FileWriter class
                            FileWriter writer = new FileWriter(
                                    "C:\\Users\\ARYAN SURI\\Desktop\\Project JAVA\\Properties\\" + this.user
                                            + "list.txt");
                            System.out.println("");
                            writer.append(fileContents);
                            writer.flush();
                            Login obj5 = new Login(this.user, this.pass);

                        } else if (value == 4) {
                            // Instantiating the Scanner class to read the file
                            Scanner sc = new Scanner(file2);
                            // instantiating the StringBuffer class
                            StringBuffer buffer = new StringBuffer();
                            // Reading lines of the file and appending them to StringBuffer
                            while (sc.hasNextLine()) {
                                buffer.append(sc.nextLine() + System.lineSeparator());
                            }
                            String fileContents = buffer.toString();
                            System.out.println("Contents of the file: " + fileContents);
                            // closing the Scanner object
                            sc.close();
                            System.out.println("Enter the Contact to be deleted");
                            System.out.print("Enter Name: ");
                            String name = askval2.nextLine();
                            System.out.print("Enter Contact Number: ");
                            String phno = askval2.nextLine();
                            System.out.print("Enter Address: ");
                            String addrs = askval2.nextLine();
                            System.out.print("Enter DOB (dd/mm/yy): ");
                            String dob = askval2.nextLine();
                            String oldLine = "Name: " + name + " Contact Number: " + phno + " Address: " + addrs
                                    + " DOB: " + dob;

                            String newLine = "";
                            // Replacing the old line with new line
                            fileContents = fileContents.replaceAll(oldLine, newLine);
                            // instantiating the FileWriter class
                            FileWriter writer = new FileWriter(
                                    "C:\\Users\\ARYAN SURI\\Desktop\\Project JAVA\\Properties\\" + this.user
                                            + "list.txt");
                            System.out.println("");
                            writer.append(fileContents);
                            writer.flush();
                            Login obj6 = new Login(this.user, this.pass);
                        } else if (value >= 5) {
                            System.out.println("Exiting Program");
                            System.out.println("Thanks for using");

                        } else {
                            System.out.println("Unexpected Error Please Try Again");
                        }
                    } catch (FileNotFoundException e) {
                        throw e;
                    } catch (IOException e) {

                        e.printStackTrace();
                    }

                } else {
                    continue;
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

class Signup {
    String user, pass;

    Signup(String user, String pass) {
        this.user = user;
        this.pass = pass;

        String[] arr = new String[2];
        arr[0] = this.user;
        arr[1] = this.pass;
        File filen = new File("C:\\Users\\ARYAN SURI\\Desktop\\Project JAVA\\Properties\\" + this.user + "list.txt");
        try {
            if (filen.createNewFile()) {
                System.out.println("Account Created: " + this.user);
            } else {
                System.out.println("User Already exists rerun the program ");
                return;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        File file1 = new File("C:\\Users\\ARYAN SURI\\Desktop\\Project JAVA\\Properties\\UserList.txt");
        try {
            if (file1.createNewFile()) {
                System.out.println("");
            } else {
                System.out.println("");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            FileWriter fw = new FileWriter(file1.getAbsoluteFile(), true);
            fw.write(arr[0] + " " + arr[1] + '\n');
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Login obj3 = new Login(this.user, this.pass);

    }
}

public class ProjectFriendlist {
    public static void main(String[] args) {
        Scanner askval = new Scanner(System.in);
        System.out.println("Welcome to FriendList");
        System.out.println("Please choose an option");
        System.out.println("1)Login");
        System.out.println("2)Signup");
        int a = askval.nextInt();
        if (a == 1) {
            System.out.println("Enter Your Username: ");
            String user = askval.next();
            System.out.println("Enter the Password");
            String pass = askval.next();
            Login obj2 = new Login(user, pass);

        } else if (a == 2) {
            System.out.println("Enter Your Username: ");
            String user = askval.next();
            System.out.println("Enter the Password");
            String pass = askval.next();
            Signup obj1 = new Signup(user, pass);

        } else {
            System.out.println("Unexpected error occured please restart the program");
        }

    }

}
