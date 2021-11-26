import { Moment } from 'moment';
import { IJob } from 'app/shared/model/job.model';

export interface IEmployee {
  id?: number;
  firstName?: string;
  lastName?: string;
  email?: string;
  phoneNumber?: string;
  hireDate?: Moment;
  salary?: number;
  commissionPct?: number;
  jobs?: IJob[];
  managerId?: number;
  departmentId?: number;
}

export const defaultValue: Readonly<IEmployee> = {};
