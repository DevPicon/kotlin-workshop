package pe.devpicon.android.mykotlinandroidapp

/**
 * Created by armando on 5/12/17.
 */

class PersonModel {
    var name: String? = null
    var age: Int = 0
    var photo: String? = null

    override fun toString(): String {
        return "PersonModel(name=$name, age=$age, photo=$photo)"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other?.javaClass != javaClass) return false

        other as PersonModel

        if (name != other.name) return false
        if (age != other.age) return false
        if (photo != other.photo) return false

        return true
    }

    override fun hashCode(): Int {
        var result = name?.hashCode() ?: 0
        result = 31 * result + age
        result = 31 * result + (photo?.hashCode() ?: 0)
        return result
    }

}
