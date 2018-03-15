export class User {
    username: string;
    role: {
        id: number;
        role: String;
    };
    id: number;
    firstname: string;
    lastname: string;
    email: string;
    bio: string;
    address: {
        id: number,
        street: string,
        city: string,
        zipcode: string,
        state: string
    };
    phonenumber: string;
}

