import { ITask } from 'app/shared/model/task.model';

export interface IJob {
  id?: number;
  jobTitle?: string;
  minSalary?: number;
  maxSalary?: number;
  tasks?: ITask[];
  employeeId?: number;
}

export const defaultValue: Readonly<IJob> = {};
