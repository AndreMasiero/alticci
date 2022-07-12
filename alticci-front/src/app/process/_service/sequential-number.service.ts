import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {API_CONFIG} from '../../config/api.config';

@Injectable({
  providedIn: 'root'
})
export class SequentialNumberService {

  url = `${API_CONFIG.baseUrl}/alticci`;

  constructor(private http: HttpClient) {
  }

  calculate(n: number) {
    return this.http.get<any>(`${this.url}/${n}`);
  }


}
