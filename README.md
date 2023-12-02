# lab06_NguyenThanhSon_20106421_WWW_WebBlog
web blog lab week06

Xây dựng web blog với các tính năng:
- Đăng nhập: user thực hiện đăng nhập vào web bằng email và password của mình. Account admin: son@gmail.com password: 123
  ![Screenshot (77)](https://github.com/son1105/lab06_NguyenThanhSon_20106421_WWW_WebBlog/assets/115455297/76f62711-2433-40cc-abb5-11bb0b67f5c8)

- Đăng ký: nếu không có tài khoản, user có thể thực hiện đăng ký tài khoản bằng cách nhấn vào nút "Register"
- Nhập thông tin user để thực hiện đăng ký:
  ![Screenshot (78)](https://github.com/son1105/lab06_NguyenThanhSon_20106421_WWW_WebBlog/assets/115455297/96cf70ea-c962-4ae1-8ac4-d8d7046fd2bc)
- Nếu confirm password không khớp sẽ có thông báo:
  ![Screenshot (79)](https://github.com/son1105/lab06_NguyenThanhSon_20106421_WWW_WebBlog/assets/115455297/1741846b-e55d-4189-b8ff-5971b802ffa6)

- Khi đăng nhập thành công trang user sẽ hiện ra với phần trên để user thực hiện post 1 bài post mới, phần dưới hiển thị danh sách các post của các user được phân trang và sắp xếp theo update at của post
  ![Screenshot (97)](https://github.com/son1105/lab06_NguyenThanhSon_20106421_WWW_WebBlog/assets/115455297/50c849a8-effa-4afe-8c6d-9108038fdb8e)

- Xem thông tin của user: góc trên bên phải sẽ hiển thị tên user cho phép click để chuyển đến trang chứa thông tin của user đang đăng nhập
  ![Screenshot (88)](https://github.com/son1105/lab06_NguyenThanhSon_20106421_WWW_WebBlog/assets/115455297/426270f3-9aea-4489-aba2-e6ae56da49a8)

- Xem các bài post của user: trong trang user, click vào View Your Post để hiện thị các bài viết bản thân đã post:
  ![Screenshot (89)](https://github.com/son1105/lab06_NguyenThanhSon_20106421_WWW_WebBlog/assets/115455297/d4339539-bef7-4c65-9183-b49623cf460a)

- Thực hiện comment vào bài post bằng cách nhấn vào nút Comment, nhập comment và Enter:
  ![Screenshot (90)](https://github.com/son1105/lab06_NguyenThanhSon_20106421_WWW_WebBlog/assets/115455297/10938de7-a5a2-47ca-93e5-e23d9baa0e74)
- Một comment được thêm:
  ![Screenshot (91)](https://github.com/son1105/lab06_NguyenThanhSon_20106421_WWW_WebBlog/assets/115455297/45c49811-d988-4a6c-9ef0-4504db385471)

- Đăng xuất: user có thể đăng xuất ra màn hình đăng nhập bằng các click vào nút Log out

- Search: Tìm kiếm các bài post với metaTitle hoặc theo tên của tác giả:
    + Thực hiện nhập từ khoá tìm kiếm vào text search. Hệ thống sẽ tìm kiếm các Post có metaTitle là từ khoá bạn nhập vào.
      ![Screenshot (98)](https://github.com/son1105/lab06_NguyenThanhSon_20106421_WWW_WebBlog/assets/115455297/a579e98e-b435-4ce5-b344-48e619875703)
      ![Screenshot (99)](https://github.com/son1105/lab06_NguyenThanhSon_20106421_WWW_WebBlog/assets/115455297/5e84582d-a110-4b02-8e5d-301bfe01c28f)
    + Nếu hệ thống không tìm thấy Post nào theo metaTitle, sẽ tự động chuyển sang tìm kiếm theo tên của tác giả:
      ![Screenshot (101)](https://github.com/son1105/lab06_NguyenThanhSon_20106421_WWW_WebBlog/assets/115455297/09958c8e-a20b-4dd2-af1b-1ad888d47afd)
      ![Screenshot (102)](https://github.com/son1105/lab06_NguyenThanhSon_20106421_WWW_WebBlog/assets/115455297/618b9cd7-6a35-46b0-822d-80d723fb5959)

      ![Screenshot (103)](https://github.com/son1105/lab06_NguyenThanhSon_20106421_WWW_WebBlog/assets/115455297/a2becb50-9511-498f-92e9-9518f1aeeb70)
      ![Screenshot (104)](https://github.com/son1105/lab06_NguyenThanhSon_20106421_WWW_WebBlog/assets/115455297/4ff3a8ea-4e92-4d1b-b7b1-d69b8ea7280a)

- Xem thông tin của một user nào đó: bên cạnh mỗi bài post sẽ có tên của người đăng, click vào đó để xem thông tin của họ:
  ![Screenshot (92)](https://github.com/son1105/lab06_NguyenThanhSon_20106421_WWW_WebBlog/assets/115455297/9a7e57d3-c2bf-433d-8712-9c07eabb1dcb)
  ![image](https://github.com/son1105/lab06_NguyenThanhSon_20106421_WWW_WebBlog/assets/115455297/ac0692fa-8a26-4c68-8953-1b88a50abb3f)
- Cũng có thể xem bài viết của họ bằng cách click View Your Post trong trang user và thao tác comment nếu muốn.
  ![image](https://github.com/son1105/lab06_NguyenThanhSon_20106421_WWW_WebBlog/assets/115455297/12af6a85-2679-4122-8d4c-4d5b6a08e1ef)
  ![Screenshot (95)](https://github.com/son1105/lab06_NguyenThanhSon_20106421_WWW_WebBlog/assets/115455297/8d956595-5602-40a6-9016-bb0625f90054)
  ![image](https://github.com/son1105/lab06_NguyenThanhSon_20106421_WWW_WebBlog/assets/115455297/c33e28a8-cfe4-4345-bcfe-363d64eefd19)

- Xem comment của một post: bên dưới mỗi post sẽ có nút "Comments" để xem các comment của các user dành cho post này.
  ![Screenshot (82)](https://github.com/son1105/lab06_NguyenThanhSon_20106421_WWW_WebBlog/assets/115455297/16311a34-43b0-4b1e-8ced-4dd00928a7d0)
  ![Screenshot (83)](https://github.com/son1105/lab06_NguyenThanhSon_20106421_WWW_WebBlog/assets/115455297/7da5d1d4-61ae-4e36-a4d3-770f99f117ff)
- Comment một bài viết: user có thể thực hiện comment vào một post nào đó bằng cách nhấn xem comment và điền title + content comment và nhấn "Enter"
  ![image](https://github.com/son1105/lab06_NguyenThanhSon_20106421_WWW_WebBlog/assets/115455297/f9d90312-ccfc-49ed-b0ee-acbb02bdd66e)
- Một comment mới đã được thêm:
  ![Screenshot (85)](https://github.com/son1105/lab06_NguyenThanhSon_20106421_WWW_WebBlog/assets/115455297/9985828b-bee9-469e-b619-dee12f029056)
- Post một bài viết mới: user có thể điền thông tin vào khu vực post bài để thực hiện đăng một bài viết:
  ![Screenshot (86)](https://github.com/son1105/lab06_NguyenThanhSon_20106421_WWW_WebBlog/assets/115455297/1de5335b-74fe-4138-a029-60f1ecb60d49)
- Một bài viết mới đã được thêm:
  ![Screenshot (87)](https://github.com/son1105/lab06_NguyenThanhSon_20106421_WWW_WebBlog/assets/115455297/46666910-d3c4-4535-b653-3886420b1c28)

