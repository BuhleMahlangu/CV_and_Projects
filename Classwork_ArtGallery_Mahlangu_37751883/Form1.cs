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

namespace Classwork_ArtGallery_Mahlangu_37751883
{
    public partial class Form1 : Form
    {
        SqlConnection conn;
        SqlCommand cmd;
        string connstr = @"";
        DataSet ds;
        SqlDataAdapter adapt;

        public Form1()
        {
            InitializeComponent();
        }

        private void btnShow_Click(object sender, EventArgs e)
        {
            try
            {

            }
            catch(SqlException ex)
            {
                MessageBox.Show(ex.Message);
            }
        }
    }
}
