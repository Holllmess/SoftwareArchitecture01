package inMemoryModel;

public class MyObserver02 implements ModelChangedObserver{
    @Override
    public void ApplyUpdateModel() {
        System.out.println("'MyObserver02' --- followed everything.");
    }
}
