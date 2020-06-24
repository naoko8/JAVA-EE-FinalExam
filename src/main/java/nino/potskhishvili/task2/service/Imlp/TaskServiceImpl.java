package nino.potskhishvili.task2.service.Imlp;

import jdk.jfr.Category;
import nino.potskhishvili.task2.dto.*;
import nino.potskhishvili.task2.model.Task;
import nino.potskhishvili.task2.repository.TaskRepository;
import nino.potskhishvili.task2.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {
    @Autowired
    TaskRepository getTitle;

    @Override
    public GetTasksOutput getTask(GetTaskInput getTaskInput) {

        List<TaskDTO> taskDTOList = new ArrayList<>();
        GetTasksOutput taskOutput= new GetTasksOutput();
        for (Task task : getTitle.findAll()) {
            TaskDTO categoryDTO = new TaskDTO();
            categoryDTO.setId(task.getId());
            categoryDTO.setTitle(task.getTitle());
            taskDTOList.add((TaskDTO) taskDTOList);
        }
        taskOutput.setTask(taskDTOList);
        return taskOutput;
    }

    @Override
    public AddTaskOutput addTask(AddTaskInput addTaskInput) {
        Task task = new Task();
        task.setTitle(addTaskInput.getTitle());
        getTitle.save(task);
        AddTaskInput addTaskOutput = new AddTaskInput();
        AddTaskOutput.setMsg("SAVED");
        return AddTaskOutput;
    }


}
