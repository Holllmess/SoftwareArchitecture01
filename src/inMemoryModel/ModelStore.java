package inMemoryModel;

import modelElements.Camera;
import modelElements.Flash;
import modelElements.PoligonalModel;
import modelElements.Scene;

import java.util.ArrayList;
import java.util.Collection;

public class ModelStore implements IModelChanger{
    private Collection<PoligonalModel> models;
    private Collection<Scene> scenes;
    private Collection<Flash> flashes;
    private Collection<Camera> cameras;

    private Collection<ModelChangedObserver> changeObservers = new ArrayList<>();

    @Override
    public void NotifyChange() {
        for (ModelChangedObserver observer:changeObservers) {
            observer.ApplyUpdateModel();
        }
    }

    @Override
    public void RegisterModelChanger(ModelChangedObserver observer) {
        changeObservers.add(observer);
    }

    @Override
    public void RemoveModelChanger(ModelChangedObserver observer) {
        changeObservers.remove(observer);
    }

    public Collection<PoligonalModel> getModels() {
        return models;
    }

    public Collection<Scene> getScenes() {
        return scenes;
    }

    public Collection<Flash> getFlashes() {
        return flashes;
    }

    public Collection<Camera> getCameras() {
        return cameras;
    }

    public Collection<ModelChangedObserver> getChangeObservers() {
        return changeObservers;
    }

    public ModelStore(Collection<PoligonalModel> models, Collection<Scene> scenes, Collection<Flash> flashes, Collection<Camera> cameras) {
        this.models = models;
        this.scenes = scenes;
        this.flashes = flashes;
        this.cameras = cameras;
    }

    public ModelStore(Collection<PoligonalModel> models, Collection<Scene> scenes, Collection<Flash> flashes, Collection<Camera> cameras, Collection<ModelChangedObserver> changeObservers) {
        this.models = models;
        this.scenes = scenes;
        this.flashes = flashes;
        this.cameras = cameras;
        this.changeObservers = changeObservers;
    }

    public Collection<Scene> getScene(int item){
        return scenes;
    }
}
