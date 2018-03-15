
export class CurrentUser {
    id: number;
    role: string;
    address: number;


    constructor(id: number = 0, role: string = '', address: number = 0) {
        this.id = id;
        this.role = role;
        this.address = address;
    }
public setAddress() {
     this.address = this.address;
    }
 public setRole() {
     this.role = this.role;
  }
 public setId() {
     this.id = this.id;
  }
public getAddress() {
      return this.address;
  }
  public getRole() {
    return this.role;
}
public getId() {
    return this.id;
}
}
