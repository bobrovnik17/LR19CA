package com.example.lr19ca;

public class StudentLogic {
    public static String getStudentName(String position) {
        switch (position) {
            case "Предыдущий":
                return "Петров Петр";
            case "Текущий":
                return "Иванов Иван Иванович";
            case "Следующий":
                return "Сидоров Сидор";
            default:
                return "Неизвестный студент";
        }
    }
}