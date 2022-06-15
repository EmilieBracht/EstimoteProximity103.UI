package dtu

interface AgegroupRepository {
    abstract val agegroup: List<Agegroup>
    fun getAgegroup(ageID: String)
    fun addListener()
    //add Listner

}