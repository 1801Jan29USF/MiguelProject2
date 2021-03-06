import { Injectable } from '@angular/core';
import { CanActivate, ActivatedRouteSnapshot, RouterStateSnapshot, Router } from '@angular/router';
import { Observable } from 'rxjs/Observable';
import { CookieService } from 'ngx-cookie-service';

@Injectable()
export class HostGuard implements CanActivate {

  constructor(private Cookie: CookieService, private router: Router) { }

  canActivate(
    next: ActivatedRouteSnapshot,
    state: RouterStateSnapshot): Observable<boolean> | Promise<boolean> | boolean {
    if (this.Cookie.get('role') === 'HOST') {
      return true;
    } else {
      this.Cookie.get('role');
      this.router.navigateByUrl('/createevents');
    }
  }
}
