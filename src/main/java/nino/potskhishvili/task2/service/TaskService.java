package nino.potskhishvili.task2.service;

import nino.potskhishvili.task2.dto.AddTaskInput;
import nino.potskhishvili.task2.dto.AddTaskOutput;
import nino.potskhishvili.task2.dto.GetTaskInput;
import nino.potskhishvili.task2.dto.GetTasksOutput;

public interface TaskService {

    static GetTasksOutput getTasks(GetTaskInput getTaskInput);


    static AddTaskOutput addTask(AddTaskInput addTaskInput);
}
