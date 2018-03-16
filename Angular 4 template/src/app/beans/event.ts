import { User } from './user';

export class Event {
    id: number;
    eventname: string;
    description: string;
    dateandtime: string;
    capacity: number;
    phonenumber: string;
    location: {
        id: 0
        street: string;
        city: string;
        state: string;
        zipcode: string;
    };
    status: {
        id: 0
        status: string;
    };
    type: {
        id: 0
        type: string;
    };
    genre: {
        id: 0
        genre: string;
    };
    host: {
        id: 0
        username: string;
    };
}

