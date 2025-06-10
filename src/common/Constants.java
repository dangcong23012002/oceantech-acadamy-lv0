package common;

import java.util.Calendar;

public class Constants {
    // Giới hạn cho ID
    public static final int MIN_ID = 1; // Id bắt đầu từ 1, không phải số âm

    // Giới hạn cho tên
    public static final int MAX_NAME_LENGTH = 100;

    // Giới hạn cho ngày sinh
    public static final int MIN_YEAR_OF_BIRTH = 1900;
    public static final int CURRENT_YEAR = Calendar.getInstance().get(Calendar.YEAR); // lấy năm hiện tại

    // Giới hạn cho địa chỉ
    public static final int MAX_ADDRESS_LENGTH = 300;

    // Giới hạn cho chiều cao
    public static final float MIN_HEIGHT_CM = 50.0f;
    public static final float MAX_HEIGHT_CM = 300.0f;

    // Giới hạn cho cân nặng
    public static final float MIN_WEIGHT_KG = 5.0f;
    public static final float MAX_WEIGHT_KG = 1000.0f;

    // Giới hạn cho mã sinh viên
    public static final int MAX_STUDENT_CODE_LENGTH = 10;

    // Giới hạn cho trường theo học
    public static final int MAX_SCHOOL_NAME_LENGTH = 200;

    // Giới hạn cho năm bắt đầu học
    public static final int MIN_YEAR = 1900;
    public static final int MAX_YEAR = Calendar.getInstance().get(Calendar.YEAR);

    // Giới hạn cho điểm trung bình tích luỹ
    public static final double MIN_GPA = 0.0d;
    public static final double MAX_GPA = 10.0d;
}
