import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class StudentList {
    private List<Student> students;

    StudentList() {
        students = new ArrayList<>();
    }

    void add (Student s) {
        students.add(s);
    }

    Student login(String username, String password) {
        Student s = this.searchStudent(username);

        if (s != null) {
            if (Objects.equals(s.getAccount().getPassword(), password)) {
                return s;
            }
        }
        return null;
    }

    Student searchStudent(String username) {
        for (Student s : this.students) {
            if (Objects.equals(s.getAccount().getUsername(), username)) {
                return s;
            }
        }
        return null;
    }

    Student register() {
        Student s = new Student();
        StudentProfile sp = new StudentProfile();
        Account a = new Account();

        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        System.out.println("Please enter your first name:");
        try {
            sp.setFirstname(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Please enter your last name:");
        try {
            sp.setLastname(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Please enter your gender [M/F]:");
        try {
            sp.setGender(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Please enter your country of origin:");
        try {
            sp.setCountryOfOrigin(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Please enter the year of admission:");
        try {
            sp.setYearoOfAdmission(Integer.parseInt(br.readLine()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Please enter your age:");
        try {
            sp.setAge(Integer.parseInt(br.readLine()));
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Please enter a username [At least 6 characters]:");
        try {
            a.setUsername(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Please enter a username [At least 6 characters with at least one digit]:");
        try {
            a.setPassword(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }

        s.setStudentProfile(sp);
        s.setAccount(a);

        return s;
    }
}