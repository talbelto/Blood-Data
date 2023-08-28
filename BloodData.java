public class BloodData {
    private String BloodType;
    private  String RhFactor;
    public BloodData(){
       BloodType ="O";
       RhFactor ="+";
    }

    public BloodData(String BloodType, String RhFactor) {
        this.BloodType = BloodType;
        this.RhFactor = RhFactor;
    }
       public String getBloodType() {
            return this.BloodType;
        }

           public void setBloodType(){
               this.BloodType=BloodType;
            }
    public String getRhFactor() {
        return this.RhFactor;
    }

    public void setRhFactor(String rhFactor) {
        this.RhFactor = RhFactor;
    }
