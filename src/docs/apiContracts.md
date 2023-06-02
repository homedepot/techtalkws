## API Contracts

---

The first API that we are going to build is get by a a title key which would return a singular response.

GET `Path that you want to use`

Sample Response
```json
{
  "title": "Effective Retros & Continuous Feedback",
  "presentor": "Jane Doe",
  "date": "2019-11-15T02:39:15+0000",
  "videoLink": "https://www.youtube.com/embed/jMtG9SyZfAc"
}
```

---
The second API that we are giong to build will get all the titles that are available

GET `Path that you want to use`

```json
[
  {
    "title": "Getting Started with Kubernetes",
    "presentor": "Michael Banks",
    "date": "2020-11-15T02:39:15+0000",
    "videoLink": "https://www.youtube.com/embed/jMtG9SyZfAc"
  },
  {
    "title": "Load Testing with K6",
    "presentor": "Seth Green",
    "date": "2020-12-13T02:39:15+0000",
    "videoLink": "https://www.youtube.com/embed/jMtG9SyZfAc"
  },
  {
    "title": "Introduction to Data Science",
    "presentor": "Elmer Fudd",
    "date": "2019-11-01T02:39:15+0000",
    "videoLink": "https://www.youtube.com/embed/jMtG9SyZfAc"
  },
  {
    "title": "IaaS, PaaS and SaaS",
    "presentor": "Doctor Seuss",
    "date": "2021-08-15T02:39:15+0000",
    "videoLink": "https://www.youtube.com/embed/jMtG9SyZfAc"
  }
]
```