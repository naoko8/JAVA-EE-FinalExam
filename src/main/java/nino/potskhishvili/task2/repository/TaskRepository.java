package nino.potskhishvili.task2.repository;

import nino.potskhishvili.task2.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository  extends JpaRepository<Task,Long> {
}
