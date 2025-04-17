using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.Data.SqlClient;

namespace grp3PROJECT
{
    public partial class MaintainForm : Form
    {
        SqlConnection conn;
        SqlCommand cmd;
        public const string connstr = @"Data Source=(LocalDB)\MSSQLLocalDB;AttachDbFilename=C:\Users\User\Desktop\grp3PROJECT\Spaza_DB.mdf;Integrated Security=True";
        SqlDataAdapter adapt;
        DataSet ds;

        public MaintainForm()
        {
            InitializeComponent();
        }

        private void btnDisplaySuppliers_Click(object sender, EventArgs e)
        {
            try
            {
                using (conn = new SqlConnection(connstr))
                {
                    conn.Open();
                    string select = "SELECT * FROM Supplier";
                    cmd = new SqlCommand(select, conn);
                    adapt = new SqlDataAdapter(cmd);
                    DataTable table = new DataTable();
                    adapt.Fill(table);
                    dataGridView1.DataSource = table;

                    dataGridView1.Refresh();
                    dataGridView1.AutoGenerateColumns = true;
                    conn.Close();
                }
            }
            catch (SqlException ex)
            {
                MessageBox.Show(ex.Message);
            }
        }

        private void btnDisplayProducts_Click(object sender, EventArgs e)
        {
            try
            {
                using (conn = new SqlConnection(connstr))
                {
                    conn.Open();
                    string select = "SELECT * FROM Product";
                    cmd = new SqlCommand(select, conn);
                    adapt = new SqlDataAdapter(cmd);
                    DataTable table = new DataTable();
                    adapt.Fill(table);
                    dataGridView1.DataSource = table;

                    dataGridView1.Refresh();
                    dataGridView1.AutoGenerateColumns = true;
                    conn.Close();
                }
            }
            catch (SqlException ex)
            {
                MessageBox.Show(ex.Message);
            }
        }

        private void dataGridView1_CellContentClick(object sender, DataGridViewCellEventArgs e)
        {

        }
    }
}
