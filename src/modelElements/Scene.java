package modelElements;

import java.lang.reflect.Type;
import java.util.Collection;

public class Scene {
    static int counter = 0;
    private int id;
    private Collection<PoligonalModel> models;
    private Collection<Flash> flashes;
    private Collection<Camera> cameras;

    public int getId() {
        return id;
    }

    public Collection<PoligonalModel> getModels() {
        return models;
    }

    public Collection<Flash> getFlashes() {
        return flashes;
    }

    public Collection<Camera> getCameras() {
        return cameras;
    }

    {
        id = ++counter;
    }

    public Scene(int id, Collection<PoligonalModel> models, Collection<Flash> flashes, Collection<Camera> cameras) {
        this.id = id;
        this.models = models;
        this.flashes = flashes;
        this.cameras = cameras;
    }

    public Scene(int id, Collection<PoligonalModel> models, Collection<Camera> cameras) {
        this.id = id;
        this.models = models;
        this.cameras = cameras;
    }

    public Type method01(Type type){
        return type;
    }

    public Type method02(Type type01, Type type02){
        return type01;
    }
}
