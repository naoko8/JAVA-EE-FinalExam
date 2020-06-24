package nino.potskhishvili.task2.controller;

import nino.potskhishvili.task2.dto.AddTaskInput;
import nino.potskhishvili.task2.dto.AddTaskOutput;
import nino.potskhishvili.task2.dto.GetTaskInput;
import nino.potskhishvili.task2.dto.GetTasksOutput;
import nino.potskhishvili.task2.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/TaskController")
public class TaskController {
    @Autowired
    TaskService taskService;

    @PostMapping("getTasks")
    public GetTasksOutput getTasks(@RequestBody GetTaskInput getTasksInput) {
        return TaskService.getTasks(GetTaskInput);
    }

    @PostMapping("addTask")
    public AddTaskOutput addTask(@RequestBody AddTaskInput addTaskInput) {
        return TaskService.addTask(addTaskInput);
    }
}
