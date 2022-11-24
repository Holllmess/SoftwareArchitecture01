package inMemoryModel;

public interface IModelChanger {
    void NotifyChange();
    void RegisterModelChanger(ModelChangedObserver observer);
    void RemoveModelChanger(ModelChangedObserver observer);
}
