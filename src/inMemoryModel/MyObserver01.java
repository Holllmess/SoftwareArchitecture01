package inMemoryModel;

public class MyObserver01 implements ModelChangedObserver{
    @Override
    public void ApplyUpdateModel() {
        System.out.println("'MyObserver01' --- followed everything.");
    }
}
