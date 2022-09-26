package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class bai3 extends AppCompatActivity {
    private TextView title, content;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai3);
        Init();
        Action();
    }

    private void Action() {
        title.setText("Đề xuất kéo dài thời gian thí điểm phân làn đường Nguyễn Trãi");
        content.setText("Sở Giao thông Vận tải Hà Nội đề xuất kéo dài thời gian thí điểm phân làn đường Nguyễn Trãi đến hết năm 2022, thay vì kết thúc ngày 6/9.\n" +
                "\n" +
                "Sau một tháng thí điểm phân làn từ Ngã Tư Sở đến hầm chui Thanh Xuân bằng dải phân cách cứng, Sở Giao thông Vận tải cho rằng có \"kết quả tích cực\". Tuy nhiên, để đánh giá chính xác hơn hiệu quả của phương án thí điểm trong thời gian học sinh, sinh viên đi học trở lại và thời điểm lưu lượng phương tiện gia tăng vào cuối năm, Sở đề xuất thành phố tiếp tục cho thí điểm phân làn đường Nguyễn Trãi từ 6/9 đến 31/12.\nSở Giao thông Vận tải cho hay, sau một tháng thí điểm, tình hình giao thông trên tuyến đường đã có cải thiện, đặc biệt tại thời gian cao điểm sáng. Cả hai chiều từ Khuất Duy Tiến đi Ngã Tư Sở và ngược lại đều giảm ùn ứ giao thông, các phương tiện lưu thông trật tự hơn. Một bộ phận người tham gia giao thông đã có ý thức đi đúng phần đường, xe buýt đi lại thuận tiện, góp phần đảm bảo an toàn giao thông.\n" +
                "\n" +
                "Tuy nhiên, Sở cũng thừa nhận còn một số tồn tại, như chỉ 10 ngày đầu thí điểm (6-16/8) đã xảy ra 54 sự cố va quệt vào biển báo, lốp phản quang, trụ đảo mũi tên; vẫn còn tình trạng xe máy đi vào làn của ô tô và ngược lại (đặc biệt theo chiều đường từ Ngã Tư Sở về Khuất Duy Tiến). Vào khung giờ cao điểm, các khu vực gần nút giao thông (Ngã Tư Sở, Vũ trọng Phụng), khu vực lối lên cầu vượt Ngã Tư Sở, điểm quay đầu trên tuyến vẫn bị ùn ứ.\n" +
                "\n" +
                "Nguyên nhân là mật độ giao thông trên tuyến vào các khung giờ cao điểm rất cao; việc phân làn giúp phương tiện lưu thông nhanh hơn về khu vực các nút, giao cắt nên gây ra ùn ứ. Cùng với đó, ý thức người tham gia giao thông chưa cao; tuyến đường lại có nhiều giao cắt...\n" +
                "\n" +
                "Để khắc phục, ngành giao thông đề xuất điều chỉnh thu ngắn các vị trí dải phân cách bằng trụ đảo mũi tên 6m-8m cho phù hợp thực tế; bổ sung các biển báo, hiệu lệnh kết hợp chỉ dẫn tại các đầu giải phân cách; điều chỉnh tổ chức giao thông tại điểm quay đầu gầm cầu vượt ngã tư sở để giảm bớt các xung đột, cải thiệt tình trạng ùn ứ.\nTheo phương án công bố ngày 29/7, Hà Nội thí điểm phân làn đường Nguyễn Trãi Thời trong một tháng, từ ngày 6/8 đến 6/9. Sau đó, Sở Giao thông Vận tải Hà Nội sẽ tổng kết rút kinh nghiệm và có phương án tiếp theo. Hai làn sát vỉa hè đường Nguyễn Trãi sẽ dành cho xe máy, xe thô sơ và xe buýt; 3-4 làn sát dải phân cách giữa dành cho ôtô. Việc điều chỉnh phân làn và phương tiện được thực hiện bằng dải phân cách cứng như mũi tên phản quang, trụ chống va xô (bằng lốp), hàng rào di động... kết hợp điều chỉnh hệ thống biển báo, sơn kẻ.\n" +
                "\n" +
                "Tuyến đường Nguyễn Trãi (đoạn từ Ngã Tư Sở đến Khuất Duy Tiến - nút giao hầm chui Thanh Xuân) dài 2,1 km, rộng 19-23 m, có 5 làn xe mỗi chiều (một số đoạn rộng có 6 làn xe). Đây là tuyến đường huyết mạch phía tây nam Thủ đô, kết nối với quốc lộ 6 đi Hòa Bình, Sơn La, Điện Biên.");
    }

    private void Init() {
        title = (TextView) this.findViewById(R.id.title);
        content = (TextView) this.findViewById(R.id.content);
    }
}