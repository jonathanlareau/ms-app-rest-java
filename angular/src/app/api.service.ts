import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders, HttpClientModule } from '@angular/common/http';
import { environment } from './../environments/environment';

@Injectable({
  providedIn: 'root'
})

export class ApiService {
  resultMsg;
  constructor(private httpClient: HttpClient) { }

  public getMsg(){
    console.log("Begin of getMsg");
    return this.httpClient.get(environment.apiUrl + '/api/sayhello/Hi-from-angular');
  }
}
