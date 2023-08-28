public class Patient {

    private int IdNumber;
    private  int age;
    private BloodData Data;


    public Patient(){
        IdNumber = 0;
        age = 0;
        Data = new BloodData();

    }

    public Patient (int IdNumber, int age, String BloodType, String RhFactor){
        this.IdNumber=IdNumber;
        this.age = age;
        this.Data = new BloodData(BloodType,RhFactor);

    }

    public int getIdNumber(){
        return this.IdNumber;
    }

    public void setIdNumber(int idNumber) {
        this.IdNumber = idNumber;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public BloodData getData() {
        return this.Data;
    }

    public void setData(BloodData data) {
        this.Data = data;
    }
