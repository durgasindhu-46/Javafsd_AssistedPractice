import { TestBed } from '@angular/core/testing';

import { CrudHttpService } from './curd-http.service';

describe('CurdHttpService', () => {
  let service: CrudHttpService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(CrudHttpService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
