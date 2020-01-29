import { Component, OnInit } from '@angular/core';
import { ApiService } from '../api.service';

@Component({
  selector: 'app-say',
  templateUrl: './say.component.html',
  styleUrls: ['./say.component.css']
})
export class SayComponent implements OnInit {
  msg;

  constructor(private apiService: ApiService) { }

  ngOnInit() {
    console.log("ngOnInit Begin");
    this.apiService.getMsg().subscribe((data)=>{
      console.log("data=" + data);
      this.msg = data["Msg"];
    });
  }
}
