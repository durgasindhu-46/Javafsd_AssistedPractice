package com.example.model;

import javax.persistence.*;
@Entity
@Table(name = "tutorials")
public class Tutorial {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(name = "title",length=50)
	private String title;
	@Column(name = "description",length=200)
	private String description;
	@Column(name = "published")
	private boolean published;
	
	public Tutorial() {
	}
	public Tutorial(String title, String description, boolean published) {
		this.title = title;
		this.description = description;
		this.published = published;
	}
	public long getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isPublished() {
		return published;
	}
	public void setPublished(boolean isPublished) {
		this.published = isPublished;
	}
	@Override
	public String toString() {
		return "Tutorial [id=" + id + ", title=" + title + ", desc=" + description + ", published=" + published + "]";
	}
}
/*mysql> use mphasis;
Database changed
mysql> create table tutorials(id BigInt primary key,description varchar(30),published bit(1),title varchar(50));
Query OK, 0 rows affected (3.51 sec)

//In postman:body-raw-json and to run save button
 http://localhost:8080/api/tutorials----post
 {
"description":"Provide C basic concepts",
"published":1,
"title":"Ctutorials"

}
http://localhost:8080/api/tutorials/2--get--to get values of id 2
http://localhost:8080/api/tutorials/2--put --to change values of id 2
{

"published":1,
 "title": "sharptutorials",
 "description": "Provide sharp api"

}
http://localhost:8080/api/tutorials--get --all the values are print
 {
        "id": 1,
        "title": "javatutorials",
        "description": "Provide core java api",
        "published": true
    },
    {
        "id": 2,
        "title": "sharptutorials",
        "description": "Provide sharp api",
        "published": true
    },
    {
        "id": 3,
        "title": "Ctutorials",
        "description": "Provide C basic concepts",
        "published": true
    }
    
   http://localhost:8080/api/tutorials/published--get
   It displayes all the published values
   [
    {
        "id": 1,
        "title": "javatutorials",
        "description": "Provide core java api",
        "published": true
    },
    {
        "id": 3,
        "title": "Ctutorials",
        "description": "Provide C basic concepts",
        "published": true
    }
] 
Here id 2 is changed to publish as false

mysql> select * from tutorials;
+----+--------------------------+----------------------+----------------+
| id | description              | published            | title          |
+----+--------------------------+----------------------+----------------+
|  1 | Provide core java api    | 0x01                 | javatutorials  |
|  2 | Provide sharp api        | 0x00                 | sharptutorials |
|  3 | Provide C basic concepts | 0x01                 | Ctutorials     |

http://localhost:8080/api/tutorials/3--delete
mysql> select * from tutorials;
+----+-----------------------+----------------------+----------------+
| id | description           | published            | title          |
+----+-----------------------+----------------------+----------------+
|  1 | Provide core java api | 0x01                 | javatutorials  |
|  2 | Provide sharp api     | 0x00                 | sharptutorials |
+----+-----------------------+----------------------+----------------+


*/
