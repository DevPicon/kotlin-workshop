package pe.devpicon.android.mykotlinandroidapp;

/**
 * Created by armando on 5/12/17.
 */

public class PersonModel {
    private String name;
    private int age;
    private String photo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PersonModel that = (PersonModel) o;

        if (age != that.age) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        return photo != null ? photo.equals(that.photo) : that.photo == null;

    }

    @Override
    public String toString() {
        return "PersonModel{" + "name='" + name + '\'' + ", age=" + age + ", photo='" + photo + '\'' + '}';
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        result = 31 * result + (photo != null ? photo.hashCode() : 0);
        return result;
    }
}
