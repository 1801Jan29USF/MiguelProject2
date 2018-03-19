import { User } from './user';

export class Event {
    id: number;
    eventname: string;
    description: string;
    dateandtime: string;
    capacity: number;
    phonenumber: string;
    attending: number;
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
    userevents: Array<User>;
    host: {
        id: 0
        username: string;
    };
}

