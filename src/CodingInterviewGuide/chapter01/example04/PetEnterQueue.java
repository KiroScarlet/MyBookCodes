package CodingInterviewGuide.chapter01.example04;

/**
 * @author KiroScarlet
 * @date 2019-04-14  -23:13
 */
public class PetEnterQueue {
    private Pet pet;
    private long count;

    public PetEnterQueue(Pet pet, long count) {
        this.pet = pet;
        this.count = count;
    }

    public Pet getPet() {
        return pet;
    }

    public long getCount() {
        return count;
    }

    public String getEnterPetType() {
        return pet.getPetType();
    }
}
