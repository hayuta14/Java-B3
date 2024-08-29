import java.util.HashMap;
import java.util.Map;

public class DoctorManagement {
    private HashMap<String, Doctor> doctors;

    public DoctorManagement() {
        doctors = new HashMap<>();
    }

    // Thêm bác sỹ
    public boolean addDoctor(Doctor doctor) throws Exception {
        if (doctors == null) {
            throw new Exception("Database doesn't exist");
        }
        if (doctor == null) {
            throw new Exception("Data doesn't exist");
        }
        if (doctors.containsKey(doctor.getCode())) {
            throw new Exception("Doctor code " + doctor.getCode() + " is duplicate");
        }
        doctors.put(doctor.getCode(), doctor);
        return true;
    }

    // Cập nhật thông tin bác sỹ
    public boolean updateDoctor(Doctor doctor) throws Exception {
        if (doctors == null) {
            throw new Exception("Database doesn't exist");
        }
        if (doctor == null) {
            throw new Exception("Data doesn't exist");
        }
        if (!doctors.containsKey(doctor.getCode())) {
            throw new Exception("Doctor code doesn’t exist");
        }
        doctors.replace(doctor.getCode(), doctor);
        return true;
    }

    // Xóa bác sỹ
    public boolean deleteDoctor(String code) throws Exception {
        if (doctors == null) {
            throw new Exception("Database doesn't exist");
        }
        if (code == null || !doctors.containsKey(code)) {
            throw new Exception("Doctor code doesn’t exist");
        }
        doctors.remove(code);
        return true;
    }

    // Tìm kiếm bác sỹ
    public HashMap<String, Doctor> searchDoctor(String input) throws Exception {
        if (doctors == null) {
            throw new Exception("Database doesn't exist");
        }

        HashMap<String, Doctor> result = new HashMap<>();
        for (Map.Entry<String, Doctor> entry : doctors.entrySet()) {
            Doctor doctor = entry.getValue();
            if (doctor.getCode().contains(input) || doctor.getName().contains(input) ||
                    doctor.getSpecialization().contains(input)) {
                result.put(doctor.getCode(), doctor);
            }
        }
        return result;
    }

    // Hiển thị tất cả các bác sỹ
    public void displayDoctors() {
        for (Doctor doctor : doctors.values()) {
            System.out.println(doctor);
        }
    }
}
