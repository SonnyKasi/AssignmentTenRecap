package ac.za.cput.domain;
public class Gender {
    private String gender;
    public String getGender() {
        return gender;
    }
    private Gender(Builder builder){
        this.gender = builder.gender;
    }
    public static class Builder{
        private String gender;
        public Builder gender(String gender){
            this.gender = gender;
            return this;
        }
        public Gender build(){
            return new Gender(this);
        }
    }
}
