package common;

import java.time.LocalDate;

import static common.Constants.*;

public class Validate {
    public static boolean isValidName(String name) {
        if (name.isEmpty() || (name.length() > 0 && name.trim().isEmpty()) || name.length() > MAX_NAME_LENGTH) {
            System.out.println("Name cannot be empty and must be greater than 100 characters!");
            return false;
        }
        return true;
    }

    public static boolean isValidDateOfBirth(LocalDate birthDateOfBirth) {
        if (birthDateOfBirth  == null || birthDateOfBirth.getYear() < MIN_YEAR_OF_BIRTH || birthDateOfBirth.getYear() > CURRENT_YEAR) {
            System.out.println("Year of birth must be between " + MIN_YEAR_OF_BIRTH + " and " + CURRENT_YEAR + "!");
            return false;
        }
        return true;
    }

    public static boolean isValidAddress(String address) {
        if (address.length() > MAX_ADDRESS_LENGTH || address.isBlank()) {
            System.out.println("Address cannot be empty and must be less than " + MAX_ADDRESS_LENGTH + " characters!");
            return false;
        }
        return true;
    }

    public static boolean isValidHeight(Float height) {
        if (height == null || height < MIN_HEIGHT_CM || height > MAX_HEIGHT_CM) {
            System.out.println("Height must be between 50.0cm and 300.0cm!");
            return false;
        }
        return true;
    }

    public static boolean isValidWeight(Float weight) {
        if (weight == null || weight < MIN_WEIGHT_KG || weight > MAX_WEIGHT_KG) {
            System.out.println("Weight must be between 5.0kg and 1000.0kg");
            return false;
        }
        return true;
    }

    public static boolean isValidStudentCode(String studentCode) {
        if (studentCode == null || studentCode.isBlank() || studentCode.length() != MAX_STUDENT_CODE_LENGTH) {
            System.out.println("Student code contains " + MAX_STUDENT_CODE_LENGTH + " characters and cannot be empty!");
            return false;
        }
        return true;
    }

    public static boolean isValidSchoolName(String schoolName) {
        if (schoolName.isEmpty() || schoolName.length() > 0 && schoolName.trim().isEmpty() || schoolName.length() > MAX_SCHOOL_NAME_LENGTH) {
            System.out.println("School name cannot be empty and must be less than " + MAX_SCHOOL_NAME_LENGTH + " characters!");
            return false;
        }
        return true;
    }

    public static boolean isValidYearOfStarting(Integer yearOfStarting) {
        if (yearOfStarting == null || yearOfStarting < MIN_YEAR || yearOfStarting > MAX_YEAR) {
            System.out.println("Start year must be between " + MIN_YEAR + " and " + MAX_YEAR + "!");
            return false;
        }
        return true;
    }

    public static boolean isValidGpa(Float gpa) {
        if (gpa == null || gpa < MIN_GPA || gpa > MAX_GPA) {
            System.out.println("Gpa must be between " + MIN_GPA + " and " + MAX_GPA + "!");
            return false;
        }
        return true;
    }
}
