import { Injectable } from '@angular/core';
import { CanActivate, ActivatedRouteSnapshot, RouterStateSnapshot, Router } from '@angular/router';
import { Observable } from 'rxjs/Observable';
import { CookieService } from 'ngx-cookie-service';

@Injectable()
export class AttendeeGuard implements CanActivate {

  constructor(private Cookie: CookieService, private router: Router) { }
  canActivate(
    next: ActivatedRouteSnapshot,
    state: RouterStateSnapshot): Observable<boolean> | Promise<boolean> | boolean {
    if (this.Cookie.get('attendee')) {
      return true;
    } else {
      this.Cookie.get('attendee');
      this.router.navigateByUrl('/dashboard');
    }
  }
}
