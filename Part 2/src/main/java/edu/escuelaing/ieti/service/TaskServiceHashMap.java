package edu.escuelaing.ieti.service;
import edu.escuelaing.ieti.data.Task;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
@Service
public class TaskServiceHashMap implements TaskService{
    private final HashMap<String, Task> tasksHashMap = new HashMap();
    @Override
    public Task create(Task task) {
        return tasksHashMap.put(task.getId(), task);
    }
    @Override
    public Task findById(String id) {
        Task task = tasksHashMap.get(id);
        return task;
    }
    @Override
    public List<Task> all() {
        return new ArrayList<>(tasksHashMap.values());
    }
    @Override
    public void deleteById(String id) {
        tasksHashMap.remove(id);
    }
    @Override
    public Task update(Task task, String id) {
        return tasksHashMap.put(id, task);
    }
}